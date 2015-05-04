package src;

import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

public abstract class StatsView extends JPanel {
	private JLabel lblTypelabel;
	private JLabel lblStar_1;
	private JLabel lblStar_2;
	private JLabel lblStar_3;
	private JProgressBar pbStarPoints;
	private JLabel lblPoints;
	private JTextField txtPointsdisplay;
	private JLabel lblLimitingfactor;
	private JTextField txtLimitingfactordisplay;
	private int[] starPoints = new int[4];	
	private int points;
	private LevelStats stats;
	private static final Color CLR_NO_STARS = new Color(255,0,0,255);
	public StatsView(LevelStats stats) {
		this.stats = stats;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{25, 0, 0, 0, 25, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 50, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		GridBagConstraints gbc_lblTypelabel = new GridBagConstraints();
		gbc_lblTypelabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTypelabel.gridwidth = 3;
		gbc_lblTypelabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTypelabel.gridx = 1;
		gbc_lblTypelabel.gridy = 1;
		add(getLblTypeLabel(), gbc_lblTypelabel);
		GridBagConstraints gbc_lblStar_1 = new GridBagConstraints();
		gbc_lblStar_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStar_1.gridx = 1;
		gbc_lblStar_1.gridy = 2;
		add(getLblStar_1(), gbc_lblStar_1);
		GridBagConstraints gbc_lblStar_2 = new GridBagConstraints();
		gbc_lblStar_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStar_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblStar_2.gridx = 2;
		gbc_lblStar_2.gridy = 2;
		add(getLblStar_2(), gbc_lblStar_2);
		GridBagConstraints gbc_lblStar_3 = new GridBagConstraints();
		gbc_lblStar_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStar_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblStar_3.gridx = 3;
		gbc_lblStar_3.gridy = 2;
		add(getLblStar_3(), gbc_lblStar_3);
		GridBagConstraints gbc_pbStarPoints = new GridBagConstraints();
		gbc_pbStarPoints.fill = GridBagConstraints.BOTH;
		gbc_pbStarPoints.gridwidth = 3;
		gbc_pbStarPoints.insets = new Insets(0, 0, 5, 5);
		gbc_pbStarPoints.gridx = 1;
		gbc_pbStarPoints.gridy = 3;
		add(getPbStarPoints(), gbc_pbStarPoints);
		GridBagConstraints gbc_lblPoints = new GridBagConstraints();
		gbc_lblPoints.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPoints.insets = new Insets(0, 0, 5, 5);
		gbc_lblPoints.gridx = 2;
		gbc_lblPoints.gridy = 4;
		add(getLblPoints(), gbc_lblPoints);
		GridBagConstraints gbc_txtPointsdisplay = new GridBagConstraints();
		gbc_txtPointsdisplay.gridwidth = 3;
		gbc_txtPointsdisplay.insets = new Insets(0, 0, 5, 5);
		gbc_txtPointsdisplay.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPointsdisplay.gridx = 1;
		gbc_txtPointsdisplay.gridy = 5;
		add(getTxtPointsdisplay(), gbc_txtPointsdisplay);
		GridBagConstraints gbc_lblLimitingfactor = new GridBagConstraints();
		gbc_lblLimitingfactor.insets = new Insets(0, 0, 5, 5);
		gbc_lblLimitingfactor.gridx = 2;
		gbc_lblLimitingfactor.gridy = 6;
		add(getLblLimitFactor(), gbc_lblLimitingfactor);
		GridBagConstraints gbc_txtLimitingfactordisplay = new GridBagConstraints();
		gbc_txtLimitingfactordisplay.gridwidth = 3;
		gbc_txtLimitingfactordisplay.insets = new Insets(0, 0, 0, 5);
		gbc_txtLimitingfactordisplay.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLimitingfactordisplay.gridx = 1;
		gbc_txtLimitingfactordisplay.gridy = 7;
		add(getTxtLimitingfactordisplay(), gbc_txtLimitingfactordisplay);		
	}

	/**
	 * Set the local LevelStats
	 * @param stats the stats to set locally
	 */
	public void setStats(LevelStats stats){
		this.stats = stats;
	}
	
	/**
	 * Update the view from the stats
	 */
	public void update(){
		setPoints(stats.getScore());
		setCorrectProgressColor();
		setStarsToShow();
	}
	
	
	
	/**
	 * Sets the points required for each star to be achieved
	 * @param star1 The points required for achieving 1 star
	 * @param star2 The points required for achieving 2 stars
	 * @param star3 The points required for achieving 3 stars
	 */
	public void setStarPoints(int star1, int star2, int star3){
		setStarPoints(star1, 1);
		setStarPoints(star2, 2);
		setStarPoints(star3, 3);
	}
	
	/**
	 * Initializes the value display boxes to 0
	 */
	public void initializeValueDisplays(){
		initializeValueDisplays(0,0);
	}
	
	/**
	 * Initializes the value display boxes to the given values
	 * @param initialPoints The initial points value to display
	 * @param initialLimit The initial value to display for the limiting condition;
	 */
	public void initializeValueDisplays(int initialPoints, int initialLimit){
		getTxtLimitingfactordisplay().setText(Integer.toString(initialLimit));
		getTxtPointsdisplay().setText(Integer.toString(initialPoints));
	}
	
	/**
	 * Sets the text values for the level type and limiting factor labels
	 * @param type The string name for the level type
	 * @param limitingFactor The string name for the levels limiting factor
	 */
	public void initializeViewLabels(String type, String limitingFactor){
		getLblLimitFactor().setText(limitingFactor);
		getLblTypeLabel().setText(type);
	}
	
	
	
	/**
	 * Sets the current point value
	 * @param points The current point value to set
	 */
	public void setPoints(int points){
		this.points = points;
		getTxtPointsdisplay().setText(Integer.toString(this.points));
	}
	/**
	 * Get the current value for points
	 * @return The current point value
	 */
	public int getPoints(){
		return points;
	}
	
	
	/**
	 * Gets the point value required to get 3 stars
	 * @return the point value the get 3 stars
	 */
	public int getStarThreePoints(){
		return starPoints[3];
	}
	
	/**
	 * Gets the point value required to get 2 stars
	 * @return the point value the get 2 stars
	 */
	public int getStarTwoPoints(){
		return starPoints[2];
	}
	
	/**
	 * Gets the point value required to get 1 stars
	 * @return the point value the get 1 stars
	 */
	public int getStarOnePoints(){
		return starPoints[1];
	}
	
	/**
	 * Gets the point increment needed for each step of color
	 * @return
	 */
	private int getPointColorStepIncrement(){
		return getStarThreePoints()/255;
	}
	
	/**
	 * Gets the color for the progress bar based on the number of points that is currently set
	 * @return The correct color for the progress bar
	 */
	private Color getCurrentPointsColor(){
		Color pointsColor = Color.RED;
		try {
			int colorStep = getPoints()/getPointColorStepIncrement();
			pointsColor = new Color(255-colorStep, 0, colorStep);
		} catch (Exception e) {
			
		}
		
		return pointsColor;
	}
	
	/**
	 * Sets the progress bar to the correct color based on the current points value
	 */
	private void setCorrectProgressColor(){
		getPbStarPoints().setForeground(getCurrentPointsColor());
	}
	
	/**
	 * Sets the number of points required for a particular number of stars
	 * @param points The number of points required
	 * @param stars The star that the number of points is required for
	 */
	private void setStarPoints(int points, int stars){
		starPoints[stars] = points;
	}
	
	/**
	 * Sets the number of stars to show based on the set value for points
	 */
	public void setStarsToShow(){
		if (getPoints() < getStarOnePoints()){
			showStars(0);
		}
		else if(getPoints() < getStarTwoPoints()){
			showStars(1);
		}
		else if(getPoints() < getStarThreePoints()){
			showStars(2);
		}
		else{
			showStars(3);
		}
	}
	
	
	/**
	 * Sets the view according to the number of stars that should be shown
	 * @param starsToShow The number of stars (0-3) that the player has earned
	 */
	public void showStars(int starsToShow){
		switch(starsToShow){
		case 0:
			getLblStar_1().setEnabled(false);
			getLblStar_2().setEnabled(false);
			getLblStar_3().setEnabled(false);
			break;
		case 1:
			getLblStar_1().setEnabled(true);
			getLblStar_2().setEnabled(false);
			getLblStar_3().setEnabled(false);
			break;
		case 2:
			getLblStar_1().setEnabled(true);
			getLblStar_2().setEnabled(true);
			getLblStar_3().setEnabled(false);
			break;
		case 3:
			getLblStar_1().setEnabled(true);
			getLblStar_2().setEnabled(true);
			getLblStar_3().setEnabled(true);
			break;
		}
	}
	
	JLabel getLblTypeLabel() {
		if (lblTypelabel == null) {
			lblTypelabel = new JLabel("TypeLabel");
			lblTypelabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblTypelabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		}
		return lblTypelabel;
	}
	JLabel getLblStar_1() {
		if (lblStar_1 == null) {
			lblStar_1 = new JLabel("");
			lblStar_1.setEnabled(false);
			lblStar_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblStar_1.setIcon(new ImageIcon(StatsView.class.getResource("/Images/star icon.png")));
		}
		return lblStar_1;
	}
	JLabel getLblStar_2() {
		if (lblStar_2 == null) {
			lblStar_2 = new JLabel("");
			lblStar_2.setEnabled(false);
			lblStar_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblStar_2.setIcon(new ImageIcon(StatsView.class.getResource("/Images/star icon.png")));
		}
		return lblStar_2;
	}
	JLabel getLblStar_3() {
		if (lblStar_3 == null) {
			lblStar_3 = new JLabel("");
			lblStar_3.setEnabled(false);
			lblStar_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblStar_3.setIcon(new ImageIcon(StatsView.class.getResource("/Images/star icon.png")));
		}
		return lblStar_3;
	}
	JProgressBar getPbStarPoints() {
		if (pbStarPoints == null) {
			pbStarPoints = new JProgressBar();
		}
		return pbStarPoints;
	}
	JLabel getLblPoints() {
		if (lblPoints == null) {
			lblPoints = new JLabel("Points:");
			lblPoints.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPoints.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblPoints;
	}
	JTextField getTxtPointsdisplay() {
		if (txtPointsdisplay == null) {
			txtPointsdisplay = new JTextField();
			txtPointsdisplay.setHorizontalAlignment(SwingConstants.CENTER);
			txtPointsdisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtPointsdisplay.setText("PointsDisplay");
			txtPointsdisplay.setColumns(10);
		}
		return txtPointsdisplay;
	}
	JLabel getLblLimitFactor() {
		if (lblLimitingfactor == null) {
			lblLimitingfactor = new JLabel("LimitingFactor");
			lblLimitingfactor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblLimitingfactor;
	}
	JTextField getTxtLimitingfactordisplay() {
		if (txtLimitingfactordisplay == null) {
			txtLimitingfactordisplay = new JTextField();
			txtLimitingfactordisplay.setHorizontalAlignment(SwingConstants.CENTER);
			txtLimitingfactordisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtLimitingfactordisplay.setText("LimitingFactorDisplay");
			txtLimitingfactordisplay.setColumns(10);
		}
		return txtLimitingfactordisplay;
	}
}
