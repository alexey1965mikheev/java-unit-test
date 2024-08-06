

@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean expected = true;
    assertEquals("Пользователь должен быть совершеннолетним", expected, isAdult);	// Напиши код здесь
}
