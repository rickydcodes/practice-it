public double pay(double salary, int hours) {
    if (hours < 8) {
        return salary * hours;
    } else {
        return (salary * 8) + ((salary * 1.5) * (hours - 8));
    }
}