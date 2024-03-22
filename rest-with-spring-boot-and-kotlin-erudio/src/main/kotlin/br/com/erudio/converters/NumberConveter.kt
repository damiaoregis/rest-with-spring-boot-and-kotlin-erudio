package br.com.erudio.converters

object NumberConveter {
     fun convertToDouble(strnumber: String?): Double{
        if(strnumber.isNullOrBlank()) return 0.0
        val number = strnumber.replace(",".toRegex(), ".")
        return if (isNumeric(number))number.toDouble() else 0.0
    }


    fun isNumeric(strnumber: String?): Boolean{
        if(strnumber.isNullOrBlank()) return false;
        val number = strnumber.replace(",".toRegex(), ".")
        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }

}