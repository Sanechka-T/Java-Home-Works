void nums_zero() {
    for (int i = 100; i< 1000; ++i)
    {
        List<Integer> divisors = new ArrayList<Integer>();
        if (i % 10 == 0)
        {
            for (int j = 1; j < i; j += 2)
            {
                    if (i % j == 0)
                    {
                        divisors.add(j);
                    }
            }
            int sum = divisors.stream().reduce(0, Integer::sum);
            if (sum % 10 == 0)
            {
                System.out.println(i);
            }
        }
    }
}


void main() {
    nums_zero();
}
