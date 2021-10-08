def hcf(m, n):
    if m > n :
        m = m - n
        hcf(m, n)
    elif m < n :
        n = n - m
        hcf(m, n)
    else :
        print(m)

hcf(144, 16)