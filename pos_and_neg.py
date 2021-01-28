list=[]
num=int(input())
list.append(num)
while(num!=0):
  num=int(input())
  list.append(num)
i=0
sum=0
while(i<len(list)):
  sum=sum+list[i]
  i=i+1
print("the total sum is:",sum)
i=0
print("the +ve nos are:")
while(i<len(list)):
  if(list[i]>0):
    print(list[i])
  i=i+1
i=0
print("the -ve nos are:")
while(i<len(list)):
  if(list[i]<0):
    print(list[i])
  i=i+1
