t1=0
t2=1
n=input("Enter value of n : ")
n=int(n)
next
print(f"{t1} and {t2}  ")
i=3
while(i<=n):
    next=t1+t2
    print(next)
    t1=t2
    t2=next
    i=i+1