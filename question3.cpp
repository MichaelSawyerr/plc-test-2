#include<iostream>
#include<ctime>
using namespace std;



void arone() {

   static int a[100];
}

void artwo() {
   int a[100];
}


void arthree() {

   int *p=new int[100];
}


int main() {
   int i,n=690000;
   double fulltime;
   clock_t start, end;
   start=clock();
   for(i=0;i<n;i++) {
       arone();
   }
   end=clock();
   fulltime=((double) (end - start));
   cout<<"static array= "<<fulltime<<" cyles"<<endl;
  
   start=clock();
   for(i=0;i<n;i++) {
       artwo();
   }
   end=clock();
   fulltime=((double) (end - start));
   cout<<"stack array= "<<fulltime<<" cycles"<<endl;
  
   start=clock();
   for(i=0;i<n;i++) {
       arthree();
   }
   end=clock();
   fulltime=((double) (end - start));
   cout<<"heap array= "<<fulltime<<" cycles"<<endl;
}

