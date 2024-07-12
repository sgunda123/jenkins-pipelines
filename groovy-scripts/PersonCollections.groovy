class PersonCollections{
    static void main(String[] args){
        Person johnDoe = new Person(firstName:"John", lastName:"Doe", age:40)
        Person maryHill = new Person(firstName:"Mary", lastName:"Hill", age:30)
        Person thomasMarks = new Person(firstName:"Thomas", lastName:"Marks", age:21)

        def allPersons = [johnDoe, maryHill, thomasMarks]

        assert allPersons instanceof List

        assert allPersons.size() == 3

        assert allPersons[2] == thomasMarks

        allPersons.each {
            it -> println it.getFullName() + " "+ it.getAge()
        }

        allPersons.eachWithIndex { Person entry, int i ->
            println i +": " + entry.getFullName() 
        }

        allPersons.find {it.lastName == "Hill"} == maryHill

        allPersons.collect{it.age <=30} == [false, true, true]

        allPersons.sort{it.age} == [thomasMarks, maryHill, johnDoe]
    }
}