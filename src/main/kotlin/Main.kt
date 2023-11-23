import java.util.Scanner

fun main(args: Array<String>) {
//    /    * Conditional Statements
//    */
    //if,else
    /* class work-1 */
//    val number = -10
//    if(number>0){
//        println("Positive number")
//    }
//    else
//        println("Negative number")

//    var a = 20
//    var b = 30
//    if(a>b){
//        println("$a is greater.")
//    }
//    else if (b>a){
//        println("$b is greater.")
//    }
//    else{
//        println("Both are equal.")
//    }
    /* class work-2 */
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    if(a>b && a>c){
//        println(
//            "a = $a is greater than b and c"
//        )
//    }
//    else if(b>a && b>c){
//        println(
//            "b = $b is greater than a and c"
//        )
//    }
//    else if(c>a && c>b){
//        println("c = $c is greater than a and b")
//    }
//    else if(a==b && a>c){
//        println("$a is greater than c and b")
//    }
//    else if(a==c && a>b){
//        println("$a is greater than c and b")
//    }
//    else{
//        println("a,b,c both are equal")
//    }

    /* class work-3 */
    var sc = Scanner(System.`in`)
    var a:Int = sc.nextInt()
    var b:Int = sc.nextInt()
    var c:Int = sc.nextInt()
    if(a>b && a>c){
        println("a is greater")
    }
    else if(b>a && b>c){
        println("b is greater")
    }
    else if(c>a && c>b){
        println("c is greater")
    }
    else if (a==b && a>c){
        println("a and b are greater")
    }
    else if(a==c && a>b){
        println("a and c are greater")
    }
    else if(b==c && b>a){
        println("b and c are greater")
    }
    else{
        println("a,b,c both are equal")
    }
}