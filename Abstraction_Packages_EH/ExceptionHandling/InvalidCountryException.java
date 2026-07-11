//package Abstraction_Packages_EH.ExceptionHandling.UserRegistration;
package Abstraction_Packages_EH.ExceptionHandling;
//package Abstraction_Packages_EH.Exception_Handling;

class InvalidCountryException extends Exception {

    InvalidCountryException() {
    }

    InvalidCountryException(String msg) {
        super(msg);
    }
}