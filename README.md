# Business

# Name
  OrderingBricksUsingREST
  
# Description
  This Project helps the client to:
    1) Order bricks and create a order Id
    2) Get Order Details using Order Id
    3) Updating Order Details When the order is not in dispatched state
    4) Updating Order Dispatch status.

# Usage
  This project can be used throuh POSTMAN or other RESTFUL tools
  
    #sample
    the sample input for ordering bricks is (using POST)
    {HOSTEDURL}/orders
       {
      "customerName":"ABC",
      "brickCount":7000
       }
    the sample output is 
      {"customerName":"ABC","msg":"Inserted Successfully","dispatchStatus":"Under Process","brickCount":7000,"orderId":1}
      
    the sample for getting order details of bricks is (using GET)
      {HOSTEDURL}/orders/{id}       
    the sample output is 
      {"customerName":"ABC","msg":"","dispatchStatus":"Under Process","brickCount":7000,"orderId":1}
      
     the sample input for Updating  bricks order  is (using PUT)
    {HOSTEDURL}/orders
      {
    "brickCount":8000,
     "orderId":1
      }
    the sample output is 
       {"customerName":"ABC","msg":"Updated Successfully","dispatchStatus":"Under Process","brickCount":8000,"orderId":1}
       
      the sample input for Updating  bricks dispatch status is (using PUT)
    {HOSTEDURL}/orders/updateDispachStatus
      {
    "orderId":1,
    "dispatchStatus":"Dispatched"
      }
    the sample output is 
       {"customerName":"ABC","msg":"Updated Successfully","dispatchStatus":"Dispatched","brickCount":0,"orderId":1}
       
       
    
    
   
# Authors and acknowledgment   
  Esha Thatipally
  
#  
