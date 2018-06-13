/**
 * Created by hpp on 13.06.2018.
 */

open class Item(var name: String = "thing")
{
    fun take(Pers : Person)
    {
       Pers.DropThing(name)
    }
    fun throwout(Pers : Person)
    {
        Pers.ThrowThing(name)
    }
}
class Weapon(name: String, var Damage : Int = 10) : Item ()
{
    fun attack(Pers: Person)
    {
        Pers.HP = Pers.HP - Damage
    }
}
