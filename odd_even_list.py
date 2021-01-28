lst1=[]
n=int(input("enter a num:"))
while(n>=0):
  lst1.append(n)
  n=int(input("enter a num:"))

odd=[]
even=[]
for  i in lst1:
  if(i%2==0):
    even.append(i)
  else:
    odd.append(i)
print("the original list is:",lst1,"\nthe odd numbers list is :",odd,"\nthe even numbers list is :",even)
