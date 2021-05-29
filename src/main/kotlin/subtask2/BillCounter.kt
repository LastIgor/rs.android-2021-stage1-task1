package subtask2

class BillCounter {


    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
       // throw NotImplementedError("Not implemented")

        var fairlySplit =""
        var credit =0


        if(((bill.sum()-bill[k])/2)!=b) {
            credit=b-((bill.sum()-bill[k])/2)
            fairlySplit= credit.toString()
        }else{
            fairlySplit = "bon appetit"
        }
        return fairlySplit
    }
}
