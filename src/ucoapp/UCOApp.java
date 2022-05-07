package ucoapp;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

/**
 * UCO App
 * 
 * @author Jose Manuel Izquierdo Ramírez
 * @author Francisco Llamas Nuflo
 *
 */
public class UCOApp {
  public static void main(String[] args) {
    JFrame jf = new JFrame("UCO App");
    
    ///////////////JPANEL ALUMNO
    //Declaramos los JPanels
    JPanel jpAlumno = new JPanel(new BorderLayout());
    jpAlumno.setOpaque(true);
    jpAlumno.setBackground(Color.green);
    
    JPanel jpAlumnoNorte = new JPanel(new FlowLayout(FlowLayout.LEFT));
    jpAlumnoNorte.setOpaque(true);
    jpAlumnoNorte.setBackground(Color.blue);
    jpAlumnoNorte.setPreferredSize(new Dimension(300, 70));
    
        ImageIcon menu = new ImageIcon("src/img/menu-button.png");
        JLabel menuEtiqueta = new JLabel(menu);
        jpAlumnoNorte.add(menuEtiqueta);
    
        JLabel UCOAppTexto = new JLabel("UCOApp");
        UCOAppTexto.setForeground(Color.white);
        UCOAppTexto.setFont(new Font("Serif", Font.PLAIN, 24));
        jpAlumnoNorte.add(UCOAppTexto);
    
    //JPanel ConsultarNotas que se muestra cuando se pulsa el botón de consultar notas (del jpAlumnoSur)
    JPanel jpConsultarNotas = new JPanel();
    jpConsultarNotas.setLayout(new BoxLayout(jpConsultarNotas, BoxLayout.Y_AXIS));
    JLabel grado = new JLabel("Grado de Ingeniería Informática");
    jpConsultarNotas.add(grado);
        
    //JPanel AlumnoSur que muestra los botones    
    JPanel jpAlumnoSur = new JPanel(new BorderLayout());
    jpAlumnoSur.setOpaque(true);
    jpAlumnoSur.setBackground(Color.red);
    //jpAlumnoSur.setPreferredSize(new Dimension(1000, 1000));
    
        //Parte norte con el icono de la UCO
        ImageIcon UCOAlumno = new ImageIcon("src/img/logo_uco_small.png");
        JLabel UCOAlumnoEtiqueta = new JLabel(UCOAlumno, SwingConstants.CENTER);
        UCOAlumnoEtiqueta.setBorder(new EmptyBorder(20,0,50,0));//top,left,bottom,right
        jpAlumnoSur.add( UCOAlumnoEtiqueta, BorderLayout.NORTH);
    
        //Parte central con los cuatro botones
        JPanel jpAlumnoSurCentro = new JPanel(new GridBagLayout());
        
        JButton consultarNotas = new JButton("Consultar notas");
        consultarNotas.setBackground(Color.BLUE);
        consultarNotas.setForeground(Color.WHITE);
        consultarNotas.setPreferredSize(new Dimension(150, 150));
        GridBagConstraints posConsultarNotas = new GridBagConstraints();
        posConsultarNotas.fill = GridBagConstraints.HORIZONTAL;
        posConsultarNotas.anchor = GridBagConstraints.NORTHWEST;
        posConsultarNotas.insets = new Insets(1, 1, 1, 1);
        posConsultarNotas.gridx = 0;
        posConsultarNotas.gridy = 0;
        posConsultarNotas.gridheight = 0;
        posConsultarNotas.gridwidth = 0;
        consultarNotas.addActionListener(new CambiarJPanel(jpAlumno, jpAlumnoSur, jpConsultarNotas, posConsultarNotas, jf));
        GridBagConstraints consultarNotasConstraint = new GridBagConstraints();
        consultarNotasConstraint.insets = new Insets(10, 10, 10, 10);
        consultarNotasConstraint.gridx = 0;
        consultarNotasConstraint.gridy = 0;
        consultarNotasConstraint.gridheight = 1;
        consultarNotasConstraint.gridwidth = 1;
        jpAlumnoSurCentro.add(consultarNotas, consultarNotasConstraint);
        
        JButton consultarMatricula = new JButton("<html>Consultar<br/>matricula</html>");
        consultarMatricula.setBackground(Color.GREEN);
        consultarMatricula.setForeground(Color.BLACK);
        consultarMatricula.setPreferredSize(new Dimension(150, 150));
        GridBagConstraints consultarMatriculaConstraint = new GridBagConstraints();
        consultarMatriculaConstraint.insets = new Insets(10, 10, 10, 10);
        consultarMatriculaConstraint.gridx = 1;
        consultarMatriculaConstraint.gridy = 0;
        consultarMatriculaConstraint.gridheight = 1;
        consultarMatriculaConstraint.gridwidth = 1;
        jpAlumnoSurCentro.add(consultarMatricula, consultarMatriculaConstraint);
        
        JButton consultarHorarios = new JButton("<html>Consultar<br/>horarios</html>");
        consultarHorarios.setBackground(Color.RED);
        consultarHorarios.setForeground(Color.WHITE);
        consultarHorarios.setPreferredSize(new Dimension(150, 150));
        GridBagConstraints consultarHorariosConstraint = new GridBagConstraints();
        consultarHorariosConstraint.insets = new Insets(10, 10, 10, 10);
        consultarHorariosConstraint.gridx = 0;
        consultarHorariosConstraint.gridy = 1;
        consultarHorariosConstraint.gridheight = 1;
        consultarHorariosConstraint.gridwidth = 1;
        jpAlumnoSurCentro.add(consultarHorarios, consultarHorariosConstraint);
        
        JButton informacionGrado = new JButton("<html>Información<br/>del Grado</html>");
        informacionGrado.setBackground(new Color(102,0,153));
        informacionGrado.setForeground(Color.WHITE);
        informacionGrado.setPreferredSize(new Dimension(150, 150));
        GridBagConstraints informacionGradoConstraint = new GridBagConstraints();
        informacionGradoConstraint.insets = new Insets(10, 10, 10, 10);
        informacionGradoConstraint.gridx = 1;
        informacionGradoConstraint.gridy = 1;
        informacionGradoConstraint.gridheight = 1;
        informacionGradoConstraint.gridwidth = 1;
        jpAlumnoSurCentro.add(informacionGrado, informacionGradoConstraint);
        
        jpAlumnoSur.add( jpAlumnoSurCentro, BorderLayout.SOUTH);
        
    jpAlumno.add(jpAlumnoNorte, BorderLayout.NORTH);
    jpAlumno.add(jpAlumnoSur, BorderLayout.SOUTH);
    ///////////////FIN JPANEL ALUMNNO
    
    /////////////////JFRAME Y JPANEL DE INICIO DE SESIÓN///////////////////
    //Crear JPanel (ver clase PanelMovil) con la estructura de BorderLayout
    //  Le pasamos la imagen que queramos para el fondo
    ImageIcon imagenFondo = new ImageIcon("src/img/cellphone.png");
    JPanel jp = new PanelMovil(imagenFondo.getImage());
    jp.setLayout(new BorderLayout());
    
        // Creamos un JPanel que vamos a poner en la parte norte del layout
        // Vamos a indicar que no sea opaco (es decir, solo lo vamos a utilizar como hueco)
        // Y le vamos a decir el tamaño que preferimos que tenga
        JPanel jpn = new JPanel();
        jpn.setOpaque(false);
        jpn.setPreferredSize(new Dimension(imagenFondo.getIconWidth(), 20));

        // Lo mismo para el sur (y tendriamos que hacerlo para el este y oeste)
        JPanel jps = new JPanel();
        jps.setOpaque(false);
        jps.setPreferredSize(new Dimension(0, 18));

        // JPanel este
        JPanel jpe = new JPanel();
        jpe.setOpaque(false);
        jpe.setPreferredSize(new Dimension(18, 0));

        // JPanel oeste
        JPanel jpo = new JPanel();
        jpo.setOpaque(false);
        jpo.setPreferredSize(new Dimension(18, 0));

        // JPanel central
        JPanel jpc = new JPanel(new GridBagLayout());
        jpc.setOpaque(true);
    
    // Añadimos los paneles creados a norte, sur, este y oeste)
    jp.add(jpn, BorderLayout.NORTH);
    jp.add(jps, BorderLayout.SOUTH);
    jp.add(jpe, BorderLayout.EAST);
    jp.add(jpo, BorderLayout.WEST);
    // Añadimos lo que queramos en la parte central (idealmente sería otro JPanel donde
    //  dentro tendremos lo necesario para nuestra aplicacion)
    jp.add(jpc, BorderLayout.CENTER);
    
    
    
                /// JPanel central norte (Barra de notificaciones)
                JPanel jpcn = new JPanel(new FlowLayout(FlowLayout.RIGHT));
                jpcn.setBackground(Color.red);
                jpcn.setOpaque(true);
                ImageIcon wifi = new ImageIcon("src/img/wifi.png");
                JLabel wifiEtiqueta = new JLabel(wifi);
                jpcn.add(wifiEtiqueta);
                ImageIcon cobertura = new ImageIcon("src/img/signal.jpg");
                JLabel coberturaEtiqueta = new JLabel(cobertura);
                jpcn.add(coberturaEtiqueta);
                ImageIcon bateria = new ImageIcon("src/img/bateria.jpg");
                JLabel bateriaEtiqueta = new JLabel(bateria);
                jpcn.add(bateriaEtiqueta);

            //Crear objeto GridBagConstrainsts para especificar donde y que tamaño va a tener cada JPanel del jpc
            GridBagConstraints c = new GridBagConstraints();
            //Configuramos el GridBagConstrains
            c.anchor = GridBagConstraints.NORTHWEST;
            //Hace que se expanda
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridwidth = 4;
            c.weightx = 0.1;
            //Lo pone arriba
            c.weighty = 0.1;
            jpc.add(jpcn, c);
    
                /// JPanel central sur (Contenido)
                JPanel jpcs = new JPanel(new BorderLayout());

                    // JPanels centrales sur este y oeste (laterales) vacíos para centrar el contenido
                    JPanel jpcse = new JPanel();
                    jpcse .setOpaque(true);
                    jpcse .setBackground(Color.yellow);
                    jpcse .setPreferredSize(new Dimension(100, 100));
                    JPanel jpcso = new JPanel();
                    jpcso.setOpaque(true);
                    jpcso.setBackground(Color.yellow);
                    jpcso.setPreferredSize(new Dimension(100, 100));
                    jpcs.add( jpcse, BorderLayout.EAST);
                    jpcs.add( jpcso, BorderLayout.WEST);
                    
                    // JLabel icono UCO (sería JPanel central sur norte)
                    ImageIcon UCO = new ImageIcon("src/img/logo_uco_small.png");
                    JLabel UCOEtiqueta = new JLabel(UCO, SwingConstants.CENTER);
                    UCOEtiqueta.setBorder(new EmptyBorder(0,0,100,0));//top,left,bottom,right
                    UCOEtiqueta.setBorder(new EmptyBorder(0,0,100,0));//top,left,bottom,right
                    jpcs.add( UCOEtiqueta, BorderLayout.NORTH);
                    jpcs.setBackground(Color.blue);
                    jpcs.setOpaque(true);

                    // JPanel central sur central
                    JPanel jpcsc = new JPanel(new GridBagLayout());
                    jpcsc.setBackground(Color.green);
                    jpcsc.setOpaque(true);
                        // JLabel usuario
                        c.insets = new Insets(1, 1, 1, 1);
                        c.gridx = 0;
                        c.gridy = 0;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcsc.add(new JLabel("Usuario", SwingConstants.CENTER), c);
                        // JTextField usuario
                        c.insets = new Insets(1, 1, 5, 1);
                        c.gridx = 0;
                        c.gridy = 1;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcsc.add(new JTextField("",1), c);
                        // JLabel contraseña
                        c.insets = new Insets(1, 1, 1, 1);
                        c.gridx = 0;
                        c.gridy = 2;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcsc.add(new JLabel("Contraseña", SwingConstants.CENTER), c);
                        // JPasswordField contraseña
                        c.gridx = 0;
                        c.gridy = 3;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcsc.add(new JPasswordField("",1), c);
                        // JCheckBox contraseña
                        c.gridx = 0;
                        c.gridy = 4;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcsc.add(new JCheckBox("Mostrar contraseña"), c);
                        // JLabel contraseña olvidada
                        c.insets = new Insets(1, 1, 20, 1);
                        c.gridx = 0;
                        c.gridy = 5;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcsc.add(new JLabel("¿Contraseña olvidada?"), c);
                        // JButton iniciar session
                        c.gridx = 0;
                        c.gridy = 6;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        JButton iniciarSesionBoton = new JButton("Iniciar sesión");
                        GridBagConstraints position = new GridBagConstraints();
                        position.fill = GridBagConstraints.HORIZONTAL;
                        position.anchor = GridBagConstraints.NORTHWEST;
                        position.insets = new Insets(1, 1, 1, 1);
                        position.gridx = 0;
                        position.gridy = 0;
                        position.gridheight = 0;
                        position.gridwidth = 0;
                        iniciarSesionBoton.addActionListener(new CambiarJPanel(jpc, jpcs, jpAlumno, position, jf));
                        jpcsc.add(iniciarSesionBoton, c);
                    jpcs.add( jpcsc, BorderLayout.CENTER);
                        
                    // JPanel elegir idioma (sería JPanel central sur sur)
                    JPanel jpcss = new JPanel(new GridBagLayout());
                    jpcss.setBackground(Color.orange);
                    jpcss.setOpaque(true);
                        // JLabel selección idioma
                        c.insets = new Insets(100, 1, 1, 1);
                        c.gridx = 0;
                        c.gridy = 0;
                        c.gridheight = 1;
                        c.gridwidth = 3;
                        jpcss.add(new JLabel("Seleción idioma:", SwingConstants.CENTER), c);
                        // JLabel icono España
                        ImageIcon espana = new ImageIcon("src/img/bandera1.png");
                        JLabel espanaEtiqueta = new JLabel(espana, SwingConstants.CENTER);
                        //espanaEtiqueta.setBorder(new EmptyBorder(0,0,0,0));//top,left,bottom,right
                        c.insets = new Insets(1, 1, 1, 1);
                        c.gridx = 0;
                        c.gridy = 1;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcss.add( espanaEtiqueta, c);
                        // JLabel icono UK
                        ImageIcon UK = new ImageIcon("src/img/bandera2.png");
                        JLabel UKEtiqueta = new JLabel(UK, SwingConstants.CENTER);
                        //UKEtiqueta.setBorder(new EmptyBorder(0,0,0,0));//top,left,bottom,right
                        c.gridx = 1;
                        c.gridy = 1;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcss.add( UKEtiqueta, c);
                        // JLabel icono Francia
                        ImageIcon francia = new ImageIcon("src/img/bandera3.png");
                        JLabel franciaEtiqueta = new JLabel(francia, SwingConstants.CENTER);
                        //franciaEtiqueta.setBorder(new EmptyBorder(0,0,0,0));//top,left,bottom,right
                        c.gridx = 2;
                        c.gridy = 1;
                        c.gridheight = 1;
                        c.gridwidth = 1;
                        jpcss.add( franciaEtiqueta, c);
                    jpcs.add( jpcss, BorderLayout.SOUTH);
            
            c.insets = new Insets(1, 1, 1, 1);
            c.gridx = 0;
            c.gridy = 1;
            c.gridheight = 0;
            c.gridwidth = 0;
            jpc.add(jpcs, c);
            ///
            //
    // Añadimos el jpanel principal al JFrame
    jf.add(jp);
        
    jf.setSize(imagenFondo.getIconWidth(), imagenFondo.getIconHeight());
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setVisible(true);    
  }
}