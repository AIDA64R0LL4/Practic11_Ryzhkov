enum class Color() {
    Красный, Оранжевый, Желтый, Зеленый, Синий, Фиолетовый, Розовый;
}
fun printColor(color: Color): String {
    return when (color) {
        Color.Красный -> "Красный"
        Color.Оранжевый -> "Оранжевый"
        Color.Желтый -> "Желтый"
        Color.Зеленый -> "Зеленый"
        Color.Синий -> "Синий"
        Color.Фиолетовый -> "Фиолетовый"
        Color.Розовый -> "Розовый"
    }
}
    fun trafficlight(color: Color): String {
        return if (color == Color.Красный || color == Color.Желтый|| color == Color.Зеленый)
            "это цвет светофора"
        else
            "это не цвет светофора"
    }
fun ColorLightCar(color: Color): String {
        return when (color) {
            Color.Красный -> "Красная машина"
            Color.Оранжевый -> "Оранжевая машина"
            Color.Желтый -> "Желтая машина"
            Color.Зеленый -> "Зеленая машина"
            Color.Синий -> "Синия машина"
            Color.Фиолетовый -> "Фиолетовая машина"
            Color.Розовый -> "Розовая машина"
        }
}
fun ColorLightFruits(color: Color): String {
    return when (color) {
        Color.Красный -> "Яблоко"
        Color.Оранжевый -> "Апельсин"
        Color.Желтый -> "Лимон"
        Color.Зеленый -> "Виноград"
        Color.Синий -> "Голубика"
        Color.Фиолетовый -> "Слива"
        Color.Розовый -> "Драконов фрукт"
    }
}