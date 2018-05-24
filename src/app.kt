val matchingSimplifyMap = mapOf(
                        "CM" to "DCCCC",
                        "CD" to "CCC",
                        "XC" to "LXXXX",
                        "XL" to "XXXX",
                        "IX" to "VIIII",
                        "IV" to "IIII"
                        )

val matchingCompressMap = mapOf(
        "IIIII" to "V",
        "VV" to "X",
        "XXXXX" to "L",
        "LL" to "C",
        "CCCCC" to "D",
        "DD" to "M"
)

val matchingComplexifyMap = mapOf(
        "DCCCC" to "CM",
        "CCCC" to "CD",
        "LXXXX" to "XC",
        "XXXX" to "XL",
        "VIIII" to "IX",
        "IIII" to "IV"
)


val alphabet = listOf(
                        'M',
                        'D',
                        'C',
                        'L',
                        'X',
                        'V',
                        'I'
                    )

fun main(args: Array<String>) {
    println("Hello Bitch")
}

fun task0(): String{
    return "Hello Bitch"
}


fun convert(romanNumberString:String,convertMatchingMap:Map<String,String>):String{
    var result = romanNumberString
    convertMatchingMap.forEach { key, value -> result = result.replace(key, value) }

    return result
}

fun simplify(romanNumberString:String) = convert(romanNumberString,matchingSimplifyMap)

fun compress(romanNumberString:String) = convert(romanNumberString,matchingCompressMap)
fun complexify(romanNumberString:String) = convert(romanNumberString,matchingComplexifyMap)

fun sum(romanNumber: String,anotherRomanNumber:String) =
        (simplify(romanNumber) + simplify(anotherRomanNumber))
                .then(::sortNumber)
                .then(::compress)
                .then(::complexify)
        //complexify(compress(sortNumber(simplify(romanNumber)
        //+simplify(anotherRomanNumber))))

fun String.then(f: (String) -> String ) = f.invoke(this)

fun sortNumber(romanNumberString:String) = romanNumberString.toList().sortedBy { alphabet.indexOf(it) }.joinToString(separator = "")


