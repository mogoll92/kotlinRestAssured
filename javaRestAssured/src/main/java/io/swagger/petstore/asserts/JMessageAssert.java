package io.swagger.petstore.asserts;

import io.swagger.petstore.models.JMessage;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link JMessage} specific assertions - Generated by CustomAssertionGenerator.
 */
public class JMessageAssert extends AbstractAssert<JMessageAssert, JMessage> {

    /**
     * Creates a new <code>{@link JMessageAssert}</code> to make assertions on actual JMessage.
     *
     * @param actual the JMessage we want to make assertions on.
     */
    public JMessageAssert(JMessage actual) {
        super(actual, JMessageAssert.class);
    }

    /**
     * An entry point for JMessageAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myJMessageResponse)</code> and get specific assertion with code completion.
     *
     * @param actual the JMessage we want to make assertions on.
     * @return a new <code>{@link JMessageAssert}</code>
     */
    public static JMessageAssert assertThat(JMessage actual) {
        return new JMessageAssert(actual);
    }

    /**
     * Verifies that the actual JMessage's code is equal to the given one.
     *
     * @param code the given code to compare the actual JMessage's code to.
     * @return this assertion object.
     * @throws AssertionError - if the actual JMessage's code is not equal to the given one.
     */
    public JMessageAssert hasCode(int code) {
        // check that actual JMessage we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting code of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualCode = actual.getCode();
        if (actualCode != code) {
            failWithMessage(assertjErrorMessage, actual, code, actualCode);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual JMessage's message is equal to the given one.
     *
     * @param message the given message to compare the actual JMessage's message to.
     * @return this assertion object.
     * @throws AssertionError - if the actual JMessage's message is not equal to the given one.
     */
    public JMessageAssert hasMessage(String message) {
        // check that actual JMessage we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting message of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualMessage = actual.getMessage();
        if (!Objects.areEqual(actualMessage, message)) {
            failWithMessage(assertjErrorMessage, actual, message, actualMessage);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual JMessage's type is equal to the given one.
     *
     * @param type the given type to compare the actual JMessage's type to.
     * @return this assertion object.
     * @throws AssertionError - if the actual JMessage's type is not equal to the given one.
     */
    public JMessageAssert hasType(String type) {
        // check that actual JMessage we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting type of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualType = actual.getType();
        if (!Objects.areEqual(actualType, type)) {
            failWithMessage(assertjErrorMessage, actual, type, actualType);
        }

        // return the current assertion for method chaining
        return this;
    }

}
