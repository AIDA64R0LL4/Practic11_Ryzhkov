enum class DayOfWeek {
    Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье;
}
fun printDayOfWeek(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.Понедельник -> "Понедельник"
        DayOfWeek.Вторник -> "Вторник"
        DayOfWeek.Среда -> "Среда"
        DayOfWeek.Четверг -> "Четверг"
        DayOfWeek.Пятница -> "Пятница"
        DayOfWeek.Суббота -> "Суббота"
        DayOfWeek.Воскресенье -> "Воскресенье"
    }
}
fun Info(day: DayOfWeek): String{
    return when (day){
        DayOfWeek.Понедельник -> "В понедельник у вас 4 пары"
        DayOfWeek.Вторник -> "Вторник после пар вам нужно сходить в магазин"
        DayOfWeek.Среда -> "В среду к вам приедет дальний родственник"
        DayOfWeek.Четверг -> "В четверг вам нужно убраться по дому"
        DayOfWeek.Пятница -> "В пятницу у вас 3 пары"
        DayOfWeek.Суббота -> "В субботу у вас нет планов"
        DayOfWeek.Воскресенье -> "Воскресенье вам нужно сходить в автошколу"
    }
}
fun WorksDay(day: DayOfWeek): String {
    return if (day == DayOfWeek.Понедельник || day == DayOfWeek.Вторник || day == DayOfWeek.Четверг || day == DayOfWeek.Пятница|| day == DayOfWeek.Среда)
        "рабочий день"
    else
        "не рабочий день"
}
fun WeekEnglish(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.Понедельник -> "Monday"
        DayOfWeek.Вторник -> "Tuesday "
        DayOfWeek.Среда -> "Wednesday "
        DayOfWeek.Четверг -> "Thursday "
        DayOfWeek.Пятница -> "Friday "
        DayOfWeek.Суббота -> "Saturday "
        DayOfWeek.Воскресенье -> "Sunday  "
    }
}