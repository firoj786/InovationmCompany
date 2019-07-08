package com.sa.innovation;

public class FindWongNumber {

public static void main(String[] args) {

int[] a1= {31, 32, 33,34, 47, 48, 49}; //  2,4,6,7,10,12,13
int[] at=new int[a1.length-1];

int temp=0,x=0, t=0;

at[0]=a1[1]-a1[0];

for(int i=1;i<a1.length-1;i++) {
at[i]=a1[i+1]-a1[i];
}
for(int j=0;j<at.length;j++) {
int count=0;
for(int k=j;k<at.length;k++) {
if(at[j]==at[k]) {
count++;
}
}
if(temp<count) {
temp=count;
x=at[j];
}
}
for(int g=0;g<a1.length-1;g++) {
if((a1[g+1]-a1[g])==x) {
if(t==1) {
System.out.print(a1[--g]+" ");

t=0;
}
}
else {
if(g==a1.length-2) {
System.out.print(" "+a1[++g]);
}
t=1;
}
}
}

}