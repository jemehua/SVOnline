package pe.org.cineplanet.util;

public interface Constantes {

	public static final Long PROCESO1 = 1L;
	public static final Long PROCESO2 = 2L;
	public static final Long PROCESO3 = 3L;

	public static final Long P1_REGISTRA_PERFIL = 2L;
	public static final Long P1_EVALUACION_INICIAL = 3L;
	public static final Long P1_REGISTRO_METAS_INDICADORES = 4L;
	public static final Long P1_NOTIFICAR_GP = 5L;
	public static final Long P1_RECIBIR_NOTIFICACION = 6L;
	public static final Long P1_APROBACION_METAS = 7L;
	public static final Long P1_NOTIFICAR_ME = 8L;
	public static final Long P1_VERIFICAR_REVISAR_OBS = 9L;
	public static final Long P1_NOTIFICA_GP_METAS = 10L;
	public static final Long P1_VB = 11L;
	public static final Long P1_VERIFICAR_METAS = 12L;
	public static final Long P1_NOTIFICA_GP_METAS_FINALES = 13L;
	public static final Long P1_RECIBIR_NOTIFICACION2 = 14L;
	public static final Long P1_PLAN_COMPETENCIAS = 15L;
	public static final Long P1_PLAN_METAS = 16L;
	public static final Long P1_NOTIFICAR_ME2 = 17L;
	public static final Long P1_VERIFICAR_PLANES = 18L;
	public static final Long P1_NOTIFICA_GP_PLANES_OBS = 19L;
	public static final Long P1_MODIFICAR_PLANES = 20L;
	// public static final Long P1_NOTIFICA_GP_PLANES_FINALES = 20L;
	// public static final Long P1_DESCARGAR_ADJUNTAR = 21L;
	// public static final Long P1_VISUALIZAR_PLANES = 22L;

	public static final Long P2_NOTIFICAR_GP = 1L;
	public static final Long P2_RECIBIR_NOTIFICACION = 2L;
	public static final Long P2_CUALITATIVA_COMPETENCIAS = 3L;
	public static final Long P2_CUALITATIVA_METAS = 4L;

	public static final Long P3_RECIBIR_NOTIFICACION_GP = 2L;
	public static final Long P3_CUANTITATIVA_COMPETENCIAS = 3L;
	public static final Long P3_CUANTITATIVA_METAS = 4L;
	public static final Long P3_RECIBIR_NOTIFICACION_JI = 5L;
	public static final Long P3_CUANTITATIVA_COMPETENCIAS_JI = 6L;
	public static final Long P3_CUANTITATIVA_METAS_JI = 7L;
	public static final Long P3_RECIBIR_NOTIFICACION_TE = 8L;
	public static final Long P3_CUANTITATIVA_COMPETENCIAS_TE = 9L;
	public static final Long P3_PROCESAR_EVALUACION = 10L;

	public static final String ACTIVO = "A";
	public static final String INACTIVO = "E";
	public static final String PENDIENTE = "P";
	public static final String INICIADO = "I";
	public static final String EN_ESPERA = "EE";
	public static final String ATENDIDO = "AT";
	public static final String CANCELADO = "C";
	public static final String CONFIRMADO = "C";

	public static final String REGISTRADO = "R";
	public static final String APROBADO = "A";
	public static final String DESAPROBADO = "D";

	// Estado campaña
	public static final String CAMPAÑA_CREADO = "Creado";
	public static final String CAMPAÑA_ACTIVO = "Activo";
	public static final String CAMPAÑA_TERMINADO = "Terminado";

	// tipo meta
	public static final String FUNCIONAL = "FUNCIONAL";
	public static final String INNOVACION = "INNOVACIÓN";

	public static final boolean TRUE = true;
	public static final boolean FALSE = false;

	// roles
	public static final Long ROL_ADM = 1L;
	public static final Long ROL_EVA = 2L;
	public static final Long ROL_GP = 3L;
	public static final Long ROL_JI = 4L;
	public static final Long ROL_TE = 5L;
	public static final Long ROL_JI_AND_TE = 6L;

	// param sistema
	public static final Long ID_URL_CONFIRMACION = 1L;

	// act
	public static final String TEMPORIZADOR = "T";
	public static final String NOTIFICACION = "N";
	public static final String CONFIRMACION = "C";

	// resultados
	public static final String SUPERO_OBJETIVO = "Superó el objetivo";
	public static final String CUMPLIO_OBJETIVO = "Cumplió el objetivo";
	public static final String CUMPLIO_EN_PARTE = "Cumplió en parte el objetivo";
	public static final String NO_CUMPLIO = "No cumplió el objetivo";
	public static final String OTRO = "Otro caso";

	// responsable
	public static final String MONITOREO_EVALUACION = "ME";
	public static final String GERENTE_PUBLICO = "GP";
	public static final String JEFE_INMEDIATO = "JI";
	public static final String TITULAR_ENTIDAD = "TE";

	public static final String USR_ADMIN = "admin";
}
