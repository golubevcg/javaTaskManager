package additionalClasses;

public class LanguageSwitcherRUS implements LanguageSwitcher{

    private String addTaskToWorker = "Добавить новую задачу";
    private String editWorker = "Отредактировать сотрудника";
    private String deleteWorker = "Удалить сотрудника";
    private String editTask = "Отредактировать задачу";
    private String deleteTask = "Удалить задачу";
    private String returnToTextField = "Вернуть задачу в записи";
    private String changeWorker = "Переназначить сотрудника";
    private String markByColor = "Пометить цветом";
    private String moveTaskToInWork = "Взять задачу в работу";
    private String cut = "Вырезать";
    private String copy = "Скопировать";
    private String paste = "Вставить";
    private String delete = "Удалить";
    private String selectAll = "Выделить всё";
    private String createTaskFromSelected = "Создать задачу из выделенного";
    private String inWork = "В работу";
    private String inQueue = "В очередь";
    private String addWorker = "Добавить сотрудника";
    private String statistics = "Статистика";
    private String quit = "Выйти";
    private String suchLoginAlreadyRegistered = "Такой логин уже зарегистрирован,";
    private String pleasePickAnother = "пожалуйста выберите другой.";
    private String suchTaskAlreadyExists = "Такая задача уже существует.";
    private String areYouShureThatYouWantToClose = "Вы уверены что хотите закрыть";
    private String app = "приложение?";
    private String yes = "Да";
    private String no = "Нет";
    private String AreYouShureThatYouWantToDelete = "Вы уверены что хотите удалить";
    private String task = "задачу?";
    private String appreciateTaskLabel = "Оцените сложность выполненной задачи,";
    private String higherValueHarderTaskLabel = "чем выше число, тем сложнее задача";
    private String textOfTask = "Текст задачи";
    private String inQueueTaskType = "в очереди";
    private String inWorkTaskType = "в работе";
    private String createNewTask = "Создать новую задачу";
    private String worker = "сотрудника?";
    private String restTasks = "оставшиеся задачи:";
    private String workers = "Сотрудники:";
    private String firstDate = "Первичная дата:";
    private String lastDate = "Конечная дата:";
    private String numbersInGraphicsNotice = "Цифры в графиках - сумма рейтингов всех задач.";

    @Override
    public String getWorkersTextLabel() {
        return workers;
    }

    @Override
    public String getFirstDateTextLabel() {
        return firstDate;
    }

    @Override
    public String getLastDateTextLabel() {
        return lastDate;
    }

    @Override
    public String getNumbersInGraphicsNotice() {
        return numbersInGraphicsNotice;
    }

    @Override
    public String getRestTasks() {
        return restTasks;
    }

    @Override
    public String getWorker(){
        return worker;
    }

    @Override
    public String getTextOfTask() {
        return textOfTask;
    }

    @Override
    public String getInQueueTaskType() {
        return inQueueTaskType;
    }

    @Override
    public String getInWorkTaskType() {
        return inWorkTaskType;
    }

    @Override
    public String getCreateNewTask() {
        return createNewTask;
    }

    @Override
    public String getAppreciateTaskLabel() {
        return appreciateTaskLabel;
    }

    @Override
    public String getHigherValueHarderTaskLabel() {
        return higherValueHarderTaskLabel;
    }

    @Override
    public String getSuchTaskAlreadyExists(){
        return suchTaskAlreadyExists;
    }

    @Override
    public String getAreYouShureThatYouWantToClose() {
        return areYouShureThatYouWantToClose;
    }

    @Override
    public String getApp() {
        return app;
    }

    @Override
    public String getYes() {
        return yes;
    }

    @Override
    public String getNo() {
        return no;
    }

    @Override
    public String getAreYouShureThatYouWantToDelete() {
        return AreYouShureThatYouWantToDelete;
    }

    @Override
    public String getTask() {
        return task;
    }

    @Override
    public String getAddWorker() {
        return addWorker;
    }

    @Override
    public String getStatistics() {
        return statistics;
    }

    @Override
    public String getQuit() {
        return quit;
    }

    @Override
    public String getSuchLoginAlreadyRegistered() {
        return suchLoginAlreadyRegistered;
    }

    @Override
    public String getPleasePickAnother() {
        return pleasePickAnother;
    }

    @Override
    public String getAddTaskToWorker() {
        return addTaskToWorker;
    }

    @Override
    public String getEditWorker() {
        return editWorker;
    }

    @Override
    public String getDeleteWorker() {
        return deleteWorker;
    }

    @Override
    public String getEditTask() {
        return editTask;
    }

    @Override
    public String getDeleteTask() {
        return deleteTask;
    }

    @Override
    public String getReturnToTextField() {
        return returnToTextField;
    }

    @Override
    public String getChangeWorker() {
        return changeWorker;
    }

    @Override
    public String getMarkByColor() {
        return markByColor;
    }

    @Override
    public String getMoveTaskToInWork() {
        return moveTaskToInWork;
    }

    @Override
    public String getCut() {
        return cut;
    }

    @Override
    public String getCopy() {
        return copy;
    }

    @Override
    public String getPaste() {
        return paste;
    }

    @Override
    public String getDelete() {
        return delete;
    }

    @Override
    public String getSelectAll() {
        return selectAll;
    }

    @Override
    public String getCreateTaskFromSelected() {
        return createTaskFromSelected;
    }

    @Override
    public String getInWork() {
        return inWork;
    }

    @Override
    public String getInQueue() {
        return inQueue;
    }
}
