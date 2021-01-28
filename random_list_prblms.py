x=[1,5]
x.insert(1,3)
print("inserted 3 at",x)
#[1,3,5]
x.append(6)
print("appending 6 at",x)
#[1,3,5,6]
x.append([7,9])
print("appending [7,9] at",x)
#[1,3,5,6,[7,9]]
x.remove(6)
print("removing 6 at",x)
#[1,3,5,[7,9]]
x.extend([11,13,15])
print("extending [11,13,15] at",x)
#[1,3,5,[7,9],11,13,15]
x.reverse()
print("reversing at",x)
#[15,13,11,[7,9],5,3,1]
x.remove([7,9])
print("removing [7,9] at",x)
#[15,13,11,5,3,1]
x.insert(-3,7)
x.insert(-4,9)
print("inserted 7 nad 9 at",x)
#[15,13,11,9,7,5,3,1]
x.sort()
print("asc :",x)
#[1,3,5,7,9,11,13,15]
print("list has ",len(x)," values")
#8
print("max value:",max(x))
#15
del(x[3])
print("deleted value at index 3",x)
#[1,3,5,9,11,13,15]
del(x[-1:-4:-1])
print("deleted values",x)
#[1,3,5,9]
del(x[:2])
print("inserted 3 at",x)
#[5,9]


