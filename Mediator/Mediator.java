package Mediator;

public interface Mediator {
	void enviar(String mensagem, Colleague sender);
	void addColleague(Colleague coll);
}
