assert getUserName("Chris", "Beherens") == "cbeherens": "getUserName isn't working"
assert getUserName("siva", "Gunda") == "sgunda": "getUserName isn't working"


String getUserName(String firstName, String lastName){
    return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase()
}

void printCredential (cred){
    println("UserName is ${cred}")
}

String[] firstNames = ["Siva", "Advaith", "Adhrith", "Deepika"]
String[] lastNames = ["Gunda", "Gunda", "Gunda", "Garre"]

for (int i=0; i<firstNames.size(); i++){
    printCredential(getUserName(firstNames[i], lastNames[i]))
}