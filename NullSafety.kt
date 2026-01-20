fun profile(name : String?,age : Int?,mail: String?){
    println("DETAILS: ");
    println("Name: ${name ?: "Name is not entered"}");
    println("Age: ${age ?: "age is not entered"}");
    println("E-mail: ${mail ?: "mail is not entered"}");
}
fun main(){
    profile("NITHISH",20,null);
}
