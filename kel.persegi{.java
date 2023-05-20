1. import java.util.Scanner;
2. public class kel.persegi{
3. public static void main (String arg[]){
4. Scanner in=new Scanner(System.in);
5. Scanner masuk=new Scanner(System.in);
6. String pil, jenis;
7. System.out.println("Hitung persegi/lingkaran");
8. System.out.println("===========================");
9. System.out.print("masukkan pilihan : ");
10. pil=in.next();
11. switch(pil)
12. {
13. case "persegi":
14. int sisi;
15. System.out.print("masukkan sisi : ");
16. sisi=masuk.nextInt();
17. System.out.print("luas/keliling : ");
18. jenis=in.next();
19. switch(jenis)
20. {
21. case "luas":
22. int luas=sisi*sisi;
23. System.out.println("Luas persegi : "+luas);
24. break;
25. case "keliling":
26. int kel=4*sisi;
27. System.out.println("Keliling persegi : "+kel);
28. break;
37
29. default :
30. System.out.println("Salah masukkan jenis");
31. }
32. 
33. case "lingkaran":
34. double jari;
35. System.out.print("masukkan jari-jari : ");
36. jari=masuk.nextDouble();
37. System.out.print("luas/keliling : ");
38. jenis=in.next();
39. switch(jenis)
40. {
41. case "keliling":
42. keliling panjang*lebar;
43. System.out.println("Keliling Persegi : "+keliling);
44. break;
45. case "keliling":
46. double kell=panjang*lebar;
47. System.out.println("Keliling Persegi : "+keliling);
48. break;
49. default :
50. System.out.println("Salah masukkan jenis");
51. }
52. break;
53. default :
54. System.out.println("Salah masukkan pilihan");
55. }
56. }
57. }