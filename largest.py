lst=[10,11,4.5,55,23,0,75,34,-9,-3.4]
maxi=lst[0]
count=0
for i in range(1,len(lst)):
  if (maxi<lst[i]):
    maxi=lst[i]
print("the largest number is ",maxi)

