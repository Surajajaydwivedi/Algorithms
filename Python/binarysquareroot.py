def squareroot(x):
    if x==0 or x==1 :
        return x
    lo=0
    hi=x//2
    res=0
    while (lo<=hi):
        mid = lo//2 + hi//2
        if mid*mid == x:
            return mid
        elif mid*mid < x:
            lo=mid+1
            res=mid
        else:  #mid^2 is greater than n
            hi=mid-1
    return res

n=83
print(squareroot(n))
