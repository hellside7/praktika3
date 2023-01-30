fun main() {
    println("Введите любое натуральное число")
    var x :Int = readLine().toString().toInt()
    var pr :Int = 1
    var sum :Int = 0
    while(x!=0)
    {
        sum+=x%10
        pr*=x%10
        x/=10
    }
    println("произведение цифр числа = $pr")
    println("сумма цифр числа = $sum")
}