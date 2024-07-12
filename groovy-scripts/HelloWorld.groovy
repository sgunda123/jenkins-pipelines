class HelloWorld {
    static void main (String[] args){
        // println "Hello World"

        // int age = 40

        // def name = "John"

        // println name.getClass()

        // def my_name = """ fadksjfkajsfl;askf';aflf;'as
        // vl;dfjal';kfa;'fdlaf
        // ';f
        // a'f"""

        // println my_name.getClass()

        Person person = new Person()
        person.setFirstName("Siva")
        person.setLastName("Gunda")
        person.setAge(40)

        println person.getFullName()
        println person.getAge()
        println person.getFirstName()

        if(person.getAge() >=45 && person.getAge()<=65){
            println person.getFullName() + " is middle aged as the age is " + person.getAge() + " years old"
        }
        else{
            println person.getFullName() + " is not middle aged as the age is " + person.getAge() + " years old"
        }

        def persons = [person, new Person(firstName:"Mary", lastName: "koleman", age: 50)]
        for (p:persons){
            println(p.getFullName() + " is "+p.getAge()+" years old")
        }
    }
}

/* .java
.groovy compile or execute
* java is static typed, groovy is dynamically typed (def) keyword
* Java Needs to explicitly specify constructors, equals, hashCode, toString() methods where as groovy provides annotations
* Groovy automatically imports packages
* java by default private, groovy by default public
*/
