#include <iostream>
#include<cstdlib>
using namespace std;

int main(int argc,char *argv[])
{
    double sum = 0,average ;
    if(argc == 1){
        cout << "Please input numbers to find average." ;
    }else{
        cout << "---------------------------------" << endl ;
        for(int i = 1; i < argc;i++){
            sum += atof(argv[i]) ;
        }
        average = sum/(argc-1) ;
        cout << "Average of " << argc-1 <<  " numbers = " << average << endl ;
        cout << "---------------------------------" ;
    }
    cout << "-------------------------------------" ;
    
    return 0;
}
