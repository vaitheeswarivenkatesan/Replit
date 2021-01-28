l={}
n=input("Enter name of the veg/fru: ")
while(n!=""):
  r=float(input("Enter price of the veg/fru: "))
  l[n]=r
  n=input("Enter name of the veg/fru: ")
q=[]
a=[]
for i in l.keys():
  quant=int(input("Enter the quantity of veg/fru:"))
  q.append(quant)
  amn=l[i]*quant
  a.append(amn)
x=0
tot=0
print("\n\nNAME          QUANT    RATE    AMOUNT")
for i in l.keys():
  print(i,"         ",q[x],"    ",l[i],"    ",a[x])
  tot=tot+a[x]
  x=x+1

print("\n\nTOTAL:",tot)


