package com.github.weisj.jsvg.geometry.util;

public final class PathLengthCalculator {
   private double x = 0.0D;
   private double y = 0.0D;
   private double xStart;
   private double yStart;

   public PathLengthCalculator() {
      this.xStart = this.x;
      this.yStart = this.y;
   }

   public double segmentLength(int segmentType, double[] coords) {
      double segmentLength = 0.0D;
      switch(segmentType) {
      case 0:
         this.x = coords[0];
         this.y = coords[1];
         this.xStart = this.x;
         this.yStart = this.y;
         break;
      case 1:
         segmentLength = this.lineLength(this.x, this.y, coords[0], coords[1]);
         this.x = coords[0];
         this.y = coords[1];
         break;
      case 2:
         segmentLength = this.quadraticParametricLength(this.x, this.y, coords[0], coords[1], coords[2], coords[3]);
         this.x = coords[2];
         this.y = coords[3];
         break;
      case 3:
         segmentLength = this.cubicParametricLength(this.x, this.y, coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]);
         this.x = coords[4];
         this.y = coords[5];
         break;
      case 4:
         segmentLength = this.lineLength(this.x, this.y, coords[0], coords[1]);
         this.x = this.xStart;
         this.y = this.yStart;
         break;
      default:
         throw new IllegalStateException();
      }

      return segmentLength;
   }

   private double lineLength(double x1, double y1, double x2, double y2) {
      return GeometryUtil.lineLength(x1, y1, x2, y2);
   }

   private double quadraticParametricLength(double ax, double ay, double bx, double by, double cx, double cy) {
      if (ax == cx && ay == cy) {
         return ax == bx && ay == by ? 0.0D : this.lineLength(ax, ay, bx, by);
      } else if ((ax != bx || ay != by) && (cx != bx || cy != by)) {
         double ax0 = bx - ax;
         double ay0 = by - ay;
         double ax1 = ax - 2.0D * bx + cx;
         double ay1 = ay - 2.0D * by + cy;
         if (ax1 == 0.0D && ay1 == 0.0D) {
            return 2.0D * this.lineLength(0.0D, 0.0D, ax0, ay0);
         } else {
            double c = 4.0D * this.dot2D(ax1, ay1, ax1, ay1);
            double b = 8.0D * this.dot2D(ax0, ay0, ax1, ay1);
            double a = 8.0D * this.dot2D(ax0, ay0, ax0, ay0);
            double q = 4.0D * a * c - b * b;
            double twoCpB = 2.0D * c + b;
            double sumCBA = c + b + a;
            double l0 = 0.25D / c * (twoCpB * Math.sqrt(sumCBA) - b * Math.sqrt(a));
            if (q == 0.0D) {
               return l0;
            } else {
               double l1 = q / (8.0D * Math.pow(c, 1.5D)) * (Math.log(2.0D * Math.sqrt(c * sumCBA) + twoCpB) - Math.log(2.0D * Math.sqrt(c * a) + b));
               return l0 + l1;
            }
         }
      } else {
         return this.lineLength(ax, ay, cx, cy);
      }
   }

   private double dot2D(double x1, double y1, double x2, double y2) {
      return x1 * x2 * y1 * y2;
   }

   private double cubicParametricLength(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
      double qx = (3.0D * cx - dx + 3.0D * bx - ax) / 4.0D;
      double qy = (3.0D * cy - dy + 3.0D * by - ay) / 4.0D;
      return this.quadraticParametricLength(ax, ay, qx, qy, dx, dy);
   }
}
