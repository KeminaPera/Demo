package com.keminapera.concurrent.wangwenjun.observer1;

public abstract class RunnableObserverListener implements Runnable {
    private final ObserverListener observerListener;
    public RunnableObserverListener(ObserverListener observerListener) {
        this.observerListener = observerListener;
    }

    public void notifyAll1(Event event) {
        observerListener.onEvent(event);
    }

    public enum StateEnum{
        RUNNING, DONE, ERROR;
    }
    public static class Event {
        private final StateEnum state;
        private final Thread thread;
        private final Throwable course;

        public Event(StateEnum state, Thread thread, Throwable course) {
            this.state = state;
            this.thread = thread;
            this.course = course;
        }

        @Override
        public String toString() {
            return state.toString() + "123";
        }

        public Thread getThread() {
            return thread;
        }

        public Throwable getCourse() {
            return course;
        }

        public StateEnum getState() {
            return state;
        }
    }
}
