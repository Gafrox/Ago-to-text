val time = 18000
val toMinutes = time / 60
val toHours = time / 3600
fun main() {
    println("был(а) ${agoToText()}")
}

fun agoToText(): String {
    var string = ""
    when (time) {
        in 0..60 -> string = "только что"
        in 61..3600 -> string = "$toMinutes ${minutesToText()} назад"
        in 3601..86400 -> string = "$toHours ${hoursToText()} назад"
        in 86401..172800 -> string = "сегодня"
        in 172801..259200 -> string = "вчера"
        else -> string = "давно"
    }
    return string
}

fun minutesToText(): String {
    var string = ""
    if (toMinutes % 10 == 1 && toMinutes % 100 !== 11) {
        string = "минуту"
    } else if (toMinutes % 10 == 2 || toMinutes % 10 == 3 || toMinutes % 10 == 4
        && toMinutes % 100 !== 12 && toMinutes % 100 !== 13 && toMinutes % 100 !== 14
    ) {
        string = "минуты"
    } else string = "минут"
    return string
}

fun hoursToText(): String {
    var string = ""
    if (toHours % 10 == 1 && toHours % 100 !== 11) {
        string = "час"
    } else if (toHours % 10 == 2 || toHours % 10 == 3 || toHours % 10 == 4
        && toHours % 100 !== 12 && toHours % 100 !== 13 && toHours % 100 !== 14
    ) {
        string = "часа"
    } else string = "часов"
    return string
}