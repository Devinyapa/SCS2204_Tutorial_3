object Main extends App{

 val coverPrice:Double=24.95
 val discount=0.4

 def TotalCoverPrice(num:Int):Double={
   num*coverPrice
 }

 def TotalshippingCost(num:Int):Double={
   if(num>50) 50*3+(num-50)*0.75 else num*3
 }

 def Discount(x:Double):Double={
   x*discount
 }

 def wholesaleCost(num:Int):Double={
    TotalCoverPrice(num)+TotalshippingCost(num)-Discount(TotalCoverPrice(num))
 }

 println(wholesaleCost(60))

}
