#include <iostream>

long long fib(int index);
int main() {
    std::cout << "This is an example recursive code in C++"<< std::endl;
    int fibIndex = 0;
    std::cout<< "Give me a number to do the fibonacci sequence: ";
    std::cin >>fibIndex;
    std::cout<<"The fibonnaci sequence of " << fibIndex << " is " << fib(fibIndex) << std::endl;
    std::cout << "Thank you!" << std::endl;
    return 0;
}
//even with the fast processing speed of cpp, fib of 50 still computes to a high enough Time complexity that its almost not worth it.
//The golden ratio method (or the recurrence solution method) is probably much more valuable here.
long long fib(int index) {
    if (index <= 0){
        throw std::out_of_range("Index cannot be less than or equal to zero!");
        return -1;
    }
    else if (index == 1 || index == 2){
        std::cout << "Hit! " << index << std::endl;
        return 1;
    }
    else {
        std::cout << "Line... " << index << "!" << std::endl;
        return fib(index -1) + fib(index -2);
    }
}