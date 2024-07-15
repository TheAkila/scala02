object lab5Q3{
    def main(args:Array[String]):Unit={
        for(x<-1 to 9){println(fibbo(x))}
               
    }
    def fibbo(num:Int):Int={
            if(num==1){
                return 0
            }
            else if(num==2){
                return 1
            }
            else{
                var fib=fibbo(num-2)+fibbo(num-1)
                return fib
            }
        }        
    
}