fun main() {
    try {
        print("Введи день недели: ")
        val day = readLine()!!.toString()
        val NameDay = DayOfWeek.valueOf(day)
        println("${printDayOfWeek(NameDay)}")
        println("${WeekEnglish(NameDay)}")
        println("${Info(NameDay)}")
        println("${WorksDay(NameDay)}")
        print("Введи цвет: ")
        val color = readLine()!!.toString()
        val NameColor = Color.valueOf(color)
        println("${printColor(NameColor)}")
        println("${trafficlight(NameColor)}")
        println("${ColorLightCar(NameColor)}")
        println("${ColorLightFruits(NameColor)}")
    } catch (e: Exception) {
        println("Ошибка ввода.")
        return
    }
}