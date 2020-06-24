package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String answer = DummyBot.answer("Привет, Бот.");
        String except = "Привет умник";
        Assert.assertThat(answer, is(except));
    }

    @Test
    public void whenByeBot() {
        String answer = DummyBot.answer("Пока");
        String except = "До скорой встречи";
        Assert.assertThat(answer, is(except));
    }

    @Test
    public void whenUnknownBot() {
        String answer = DummyBot.answer("Какой сегодня день недели ?");
        String except = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertThat(answer, is(except));
    }
}