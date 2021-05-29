package subtask3

class StringParser {


    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented")

        var strtest = ""
        var result = emptyArray<String>()

        var icount = 0

        for (i in inputString.indices) {

            when {
                inputString[i] == '<' -> {

                    strtest = inputString.substring(i + 1, inputString.length)

                    for (a in strtest.indices) {

                        if (strtest[a] == '>' && icount == 0) {

                            result += strtest.substring(0, a)


                            break
                        } else if (strtest[a] == '<') {
                            icount++

                        } else if (strtest[a] == '>') {
                            icount--

                        } else if (a == strtest.length && icount != 0) {
                            icount = 0

                        }

                    }


                }
                inputString[i] == '[' -> {

                    strtest = inputString.substring(i + 1, inputString.length)
                    for (j in strtest.indices) {

                        if (strtest[j] == ']'&& icount == 0) {


                            result += strtest.substring(0, j)

                            break
                        } else if (strtest[j] == '[') {
                            icount++

                        } else if (strtest[j] == ']') {
                            icount--

                        } else if (j == strtest.length && icount != 0) {
                            icount = 0
                        }
                    }

                }
                inputString[i] == '(' -> {
                    strtest = inputString.substring(i + 1, inputString.length)
                    for (k in strtest.indices) {

                        if (strtest[k] == ')'&& icount == 0) {


                            result += strtest.substring(0, k)

                            break
                        } else if (strtest[k] == '(') {
                            icount++

                        } else if (strtest[k] == ')') {
                            icount--

                        } else if (k == strtest.length && icount != 0) {
                            icount = 0

                        }
                    }


                }
            }

        }
        return result
    }
}
