lst=[10,11,4.5,55,23,0,75,34,-9,-3.4]
n=float(input("enter a number"))
found=False
for i in range(len(lst)):
  if (n==lst[i]):
    found=True
if(found):
  print("EXIST")
else:
  print("DOESNOT EXIST")
