package com.android.example.module06_module017_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module017_module8.ClassAAG = com.android.example.module06_module017_module8.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module017_module8.ClassAAF = com.android.example.module06_module017_module8.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module06_module017_module8.ClassAAI = com.android.example.module06_module017_module8.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module017_module8.ClassAAC,
		param1: com.android.example.module06_module017_module8.ClassAAC,
		param2: com.android.example.module06_module017_module8.ClassAAI,
		param3: com.android.example.module06_module017_module8.ClassAAD
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.throwIfCanceled()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		listOf("1", "2", "3").forEach {
			val local_var_3_0: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
			local_var_3_0.onBackPressed()

		}
		val local_var_2_5: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_5.onBackPressed()

	}

	fun method1(
		param0: com.android.example.module06_module017_module8.ClassAAF
	) {
	}

	fun method2(
		param0: com.android.example.module06_module017_module8.ClassAAB
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		val local_var_2_2: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_2.hasEnabledCallbacks()

		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.isCanceled()

		val local_var_2_4: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
		local_var_2_4.clear()

	}

	fun method3(
		param0: com.android.example.module06_module017_module8.ClassAAG,
		param1: com.android.example.module06_module017_module8.ClassAAJ,
		param2: com.android.example.module06_module017_module8.ClassAAF,
		param3: com.android.example.module06_module017_module8.ClassAAD
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.cancel()

	}

	fun method4(
		param0: com.android.example.module06_module017_module8.ClassAAC,
		param1: com.android.example.module06_module017_module8.ClassAAJ
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

		param0.method0(io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
