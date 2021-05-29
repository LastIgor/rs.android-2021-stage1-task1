package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")

        var sadArray = sadArray.copyOf()
        var happyArray = intArrayOf()
        var badEl = false


        while (!badEl) {
            badEl = true
            for (i in sadArray.indices) {

                when {
                    i == 0 || i == (sadArray.size - 1) || sadArray[i - 1] + sadArray[i + 1] > sadArray[i] -> happyArray += sadArray[i]

                    else -> badEl = false

                }
            }
            sadArray = happyArray.copyOf()
            happyArray = intArrayOf()


        }



        return sadArray
    }
}
