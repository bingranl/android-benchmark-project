package com.android.example.module06_module147_module4_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAG = com.android.example.module06_module147_module4_module6.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAF = com.android.example.module06_module147_module4_module6.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param1: com.android.example.module06_module147_module4_module6.ClassAAE,
		param2: com.android.example.module06_module147_module4_module6.ClassAAD
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			listOf("1", "2", "3").forEach {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
					local_var_5_0.dispose()

				}
			}
		}
		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.shutdown()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAI,
		param1: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param2: com.android.example.module06_module147_module4_module6.ClassAAC,
		param3: com.android.example.module06_module147_module4_module6.ClassAAA
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onNext(kotlin.Any())

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.cancel()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
