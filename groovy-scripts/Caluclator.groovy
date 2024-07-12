class Caluclator {
    int Num1
    int Num2

    int addition(){
        Num1+Num2
    }

    int subtract(){
        Num1-Num2
    }

    int multiply(){
        Num1*Num2
    }

    int division(){
        try{
            Num1/Num2
        }catch(Exception e){
            println "cannot divide by zero"
        }
    }


}