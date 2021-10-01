inp=input()
b=[]
for a in inp:
    if a not in ['a','e','i','o','u','y','A','E','I','O','U','Y']:
        b.append('.')
        b.append(a)
print(b)    
    