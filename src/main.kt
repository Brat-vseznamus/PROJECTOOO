import java.util.*

/**
 * Created by hpp on 13.06.2018.
 */

fun main(args: Array<String>) {

   {
    println("Hello, DESPACITO 2")

    var demo = "demo"   //не константо, менять на другое значение того же типа ( var )
    val demo2 = "demo"  // константо , нельзя менять уже ( val )
    var loh2: Int = 5   // отличается от Int сворачимостью +
    println(loh2)
    // если мы не  указываем какой это тип, то мы можешь уточнить , чтобы функции работали нормально
    var value2 = 100
    value2.toDouble()
    var value = args[0].toDouble()
    // есть функции readline , которая читает строки, для которых надо проверять то 0ые ли они или нет
    var demo3: Double? = null
    if (value != null) {
        print(taxes(value.toDouble()))
    }
    var array = emptyArray<String>()
    array = arrayOf("123", "456")

    var array1 = Array<Int>(5) {
        i -> Random().nextInt() % 11 + 20
    }
    }

    var arr = Array<Int> ( 5 )
    {
        // var a: String? = readLine()
        i -> readLine()!!.toInt()
    }
    var sum: Int = 0
    for (i in 0 until arr.size)
    { sum+=arr[i] }
    var sr : Double
    sr = (sum / arr.size ).toDouble()
    println(sr)

    var arr2 = Array<Int> ( 10 )
    {
        // var a: String? = readLine()
        i -> Random().nextInt()

    }
    for (i in 0 until arr2.size)
    { print("${arr2[i]}  ") }



}

      class Person (var vera: Int = 0,
              var level: Int = 0 ,
              var HP : Int = 100,
              var XP : Int = 0,
              var name: String = "Vova",
                  var maxHp : Int = 100)
    {   var backpack = Array<String?>(10) { i -> null}
        var backpack2 = Array<Item?> (10) { i -> null}
        fun LevelUp()
        {
            level+=1
        }
        fun ChangeName(nameN: String)
        {
            if (nameN != null)
                name = nameN
        }
        fun Death()
        {
            XP = (XP*0.5).toInt()
            HP = (maxHp*0.05).toInt()
        }
        fun DropThing(S: String)
        {
            for (i in 0..backpack.size)
            {
                if (backpack[i] != null )
                {
                    backpack[i] = S
                    break

                }
                else
                {
                    print("Wrong Action")
                }
            }

        }
        fun ThrowThing(S: String)
        {
            for (i in 0..backpack.size)
            {
                if (backpack[i].equals(S))
                {
                    backpack[i] = null
                    break

                }
                else
                {
                    print("Wrong Action")
                }
            }

        }
    }



    fun calcSum(arg1: Int, arg2: Int): Int = arg1 + arg2

    fun taxes(income: Double, loh: Double = 0.13): Double  // задаем значение по умолчанию
    {

        return income * loh
    }

    fun odin(familia: String, name: String): String {
        if ((familia != null) && (name != null)) {
            return "Фамилия: ${familia},Имя: ${name}"
        } else
            return "oshibka"
    }

    fun dva(a: Int, b: Double): Double {
        var c: Double;
        c = (1 / 2 * (a * b).toDouble())
        return c

    }

    fun Area(h: Int): Double {
        var c: Double
        var a: String? = readLine();
        if (a != null) {
            var A: Double = a.toDouble()
            c = (1 / 2 * (h * A).toDouble())
        } else
            c = 0.0;
        return c
    }

    fun rast(): Double {
        var x1: String? = readLine();
        var y1: String? = readLine();
        var x2: String? = readLine();
        var y2: String? = readLine();
        var c: Double
        if ((x1 != null) && (x2 != null) && (y1 != null) && (y2 != null)) {

            c = Math.sqrt((x1.toDouble() - x2.toDouble()) * (x1.toDouble() - x2.toDouble()) + (y1.toDouble() - y2.toDouble()) * (y1.toDouble() - y2.toDouble()))
        } else
            c = 0.0;
        return c
    }

    fun rast(x1: Double, y1: Double, x2: Double, y2: Double): Double
    {
        var c: Double
        if ((x1 != null) && (x2 != null) && (y1 != null) && (y2 != null)) {

            c = Math.sqrt((x1.toDouble() - x2.toDouble()) * (x1.toDouble() - x2.toDouble()) + (y1.toDouble() - y2.toDouble()) * (y1.toDouble() - y2.toDouble()))
        } else
            c = 0.0;
        return c
    }

