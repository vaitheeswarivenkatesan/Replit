lst=[10,11,4.5,55,23,0,75,34,-9,-3.4]
n=float(input("enter a number"))
count=0
for i in range(len(lst)):
  if (n==lst[i]):
    count+=1
if(count>0):
  print("the number occurs ",count,"times")
else:
  print("the number does not exist in the list")

