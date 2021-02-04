package com.android.example.module06_module017_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module109_module1.ClassAAI = com.android.example.module06_module109_module1.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module017_module1.ClassAAI = com.android.example.module06_module017_module1.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module017_module1.ClassAAJ = com.android.example.module06_module017_module1.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module06_module017_module1.ClassAAC = com.android.example.module06_module017_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module017_module8.ClassAAE
	) {
	}

	fun method1(
		param0: com.android.example.module06_module017_module1.ClassAAI,
		param1: com.android.example.module06_module017_module1.ClassAAA,
		param2: com.android.example.module06_module017_module1.ClassAAF
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		for (iAb in 0..3) {
			for (iAc in 0..0) {
				val local_var_4_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
				local_var_4_0.throwIfCanceled()

				val local_var_4_1: okio.AsyncTimeout = okio.AsyncTimeout()
				local_var_4_1.enter()

				val local_var_4_2: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
				local_var_4_2.clear()

			}
		}
	}

	fun method2(
		param0: com.android.example.module06_module017_module8.ClassAAJ,
		param1: com.android.example.module06_module109_module1.ClassAAC,
		param2: com.android.example.module06_module109_module1.ClassAAB,
		param3: com.android.example.module06_module017_module8.ClassAAA
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module06_module109_module1.ClassAAB,
		param1: com.android.example.module06_module017_module1.ClassAAE
	) {
		val local_var_2_2: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_2.hasEnabledCallbacks()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.cancel()

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.getCancellationSignalObject()

	}
}
