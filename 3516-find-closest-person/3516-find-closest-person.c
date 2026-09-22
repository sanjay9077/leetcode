int findClosest(int x, int y, int z) {
int x1=abs(z-x);
int y2=abs(z-y);
    if(x1<y2) return 1;
    if(y2<x1) return 2;
   return 0;
}